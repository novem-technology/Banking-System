import { authHeader } from '../_helpers';

const apiUrl = 'http://localhost:18080'

export const userService = {
    login,
    logout,
    register,
    createCustomer,
    getAll
};

function login(usernameOrEmail, password) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ usernameOrEmail, password })
    };

    return fetch(`${apiUrl}/api/auth/signin`, requestOptions)
        .then(handleResponse)
        .then(user => {
            // login successful if there's a user in the response
            if (user) {
                // store user details and basic auth credentials in local storage 
                // to keep user logged in between page refreshes
                console.log(user);
                user.authdata = user.accessToken;
                localStorage.setItem('token', JSON.stringify(user));
            }

            return user;
        });
}

function register(customerName, username, email, password) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ customerName, username, email, password })
    };

    return fetch(`${apiUrl}/api/auth/signup`, requestOptions)
        .then(handleResponse);
}

function createCustomer(id,
    firstname, lastName, dateOfBirth, ssn,
    address1, address2, city, state, zip,
    email, phoneNumber, userName, password) {
    const requestOptions = {
        method: 'POST',
        headers: authHeader(),
        body: JSON.stringify({ id,
            firstname, lastName, dateOfBirth, ssn,
            address1, address2, city, state, zip,
            email, phoneNumber, userName, password })
    };

    return fetch(`${apiUrl}/Customer`, requestOptions)
        .then(handleResponse)
        .then((user) => {
            console.log(user);
        });
}

function logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('token');
}

function getAll() {
    const requestOptions = {
        method: 'GET',
        headers: authHeader()
    };

    return fetch(`${apiUrl}/Customer`, requestOptions).then(handleResponse);
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