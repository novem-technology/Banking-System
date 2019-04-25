import { authHeader } from '../_helpers';

const apiUrl = 'http://localhost:18080'

export const userService = {
    login,
    logout,
    register,
    createCustomer,
    getAll,
    getById,
};

function login(usernameOrEmail, password) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ usernameOrEmail, password })
    };

    console.log(requestOptions);

    return fetch(`${apiUrl}/api/auth/signin`, requestOptions)
        .then(handleResponse)
        .then(user => {
            // login successful if there's a user in the response
            if (user) {
                // store user details and basic auth credentials in local storage 
                // to keep user logged in between page refreshes
                console.log(user);
                localStorage.setItem('NovemToken', JSON.stringify(user));
            }

            return user;
        });
}

function register(name, username, email, password) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name, username, email, password })
    };

    console.log(requestOptions);

    return fetch(`${apiUrl}/api/auth/signup`, requestOptions)
        .then(handleResponse);
}

function createCustomer(id,
    firstName, lastName, dateOfBirth, ssn,
    address1, address2, city, state, zip,
    email, phoneNumber, userName, password) {
    const requestOptions = {
        method: 'POST',
        headers: authHeader(),
        body: JSON.stringify({ id,
            firstName, lastName, dateOfBirth, ssn,
            address1, address2, city, state, zip,
            email, phoneNumber, userName, password })
    };

    console.log(requestOptions);

    return fetch(`${apiUrl}/Customer`, requestOptions)
        .then(handleResponse)
        .then((e) => console.log(e));
}

function logout() {
    // remove user from local storage to log user out
    // localStorage.removeItem('NovemToken');
}

function getAll() {
    const requestOptions = {
        method: 'GET',
        headers: authHeader()
    };

    return fetch(`${apiUrl}/Customer`, requestOptions).then(handleResponse);
}

function getById(id) {
    const requestOptions = {
        method: 'GET',
        headers: authHeader()
    };

    return fetch(`${apiUrl}/Customer/${id}`, requestOptions).then(handleResponse);
}

function handleResponse(response) {
    return response.text().then(text => {
        const data = text && JSON.parse(text);
        if (!response.ok) {
            if (response.status === 401) {
                // auto logout if 401 response returned from api
                logout();
                location.reload(true);
            }

            const error = (data && data.message) || response.statusText;
            return Promise.reject(error);
        }

        return data;
    });
}