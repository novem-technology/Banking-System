export function authHeader() {
  // return authorization header with basic auth credentials
  let info = localStorage.getItem('NovemToken');
  let user = JSON.parse(info);

  if (user && user.accessToken) {
      return {
        'Authorization': 'Bearer ' + user.accessToken,
      };
  } else {
      console.log('Token not found');
      return {
        'Content-Type': 'application/json'
      };
  }
}