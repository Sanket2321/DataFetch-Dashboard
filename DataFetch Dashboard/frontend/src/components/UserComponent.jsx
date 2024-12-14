import React from "react";
import UserService from "../service/UserService";

class UserComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      users: [],
    };
  }
//lifecycle method to call rest apis
  componentDidMount() {
    UserService.getUser().then((response) => {
 //data set to the state of the component and set the resposne to the user arrray
        this.setState({ users: response.data });
    });
  }
//Once the field names match between the User entity and the User database table, the React component code that fetches and displays the user data should work as expecte
  render() {
    return (
      <div className="container">
        {/* User List Title */}
        <h1>User List</h1>

        {/* Table displaying user information */}
        <table className="table table-bordered table-striped">
          <thead>
            <tr>
              <th>User Id</th>
              <th>User First Name</th>
              <th>User Last Name</th>
              <th>User Email</th>
            </tr>
          </thead>
          <tbody>
            
            {/* Mapping user data to table rows */}
            {this.state.users.map((user) => (
              <tr key={user.id}>
                <td>{user.id}</td>
                <td>{user.firstname}</td>
                <td>{user.lastname}</td>
                <td>{user.email}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default UserComponent;
