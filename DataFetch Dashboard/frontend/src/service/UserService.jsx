import axios from 'axios'
const user_rest_url='http://localhost:8080/api/users';
class UserService {
    getUser(){
        return axios.get(user_rest_url);
    }
}
export default new UserService()