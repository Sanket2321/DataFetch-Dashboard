# <span style="font-size: 36px; font-weight: bold;">Display Database Data in UI</span>
## Key Features

1.User List Display: Fetches user data from the database and displays it in a tabular format.

2.Backend Implementation: Uses Spring Boot for creating RESTful APIs to handle database interactions.

3.Frontend Implementation: React.js is used for rendering the UI and making API calls.

4.API Integration: Demonstrates how to set up and call APIs from React components.


# What I Learned

### API Configuration:

Configured REST APIs in Spring Boot to interact with the database.

Used @RestController and @RequestMapping annotations to create endpoints.

### Connecting Frontend to Backend:

Made API calls from the frontend using Axios.

Handled asynchronous data fetching in React using lifecycle methods (componentDidMount).

### Data Fetching and State Management:

Learned how to update the React state using API response data.

Displayed the fetched data dynamically in a table.

### Structuring Project for Full-Stack Development:

Organized Spring Boot and React projects to work seamlessly together.

Created reusable components in React for efficient UI rendering.

# Technologies Used

#### Backend

.Java

.Spring Boot

.JPA (Java Persistence API)

.H2 Database (or any other database of your choice)

#### Frontend

.React.js

.Axios for API calls

.Bootstrap for styling

# How It Works

#### Backend:

A User entity is created and mapped to the database.

REST endpoints are defined to fetch data from the database (e.g., /api/users).

#### Frontend:

The UserComponent makes a GET request to the backend API using Axios.

The fetched user data is stored in the component's state and displayed in a Bootstrap-styled table.

# Challenges Faced

CORS Issues: Learned to enable CORS in Spring Boot to allow cross-origin requests from the frontend.

Data Binding: Ensured that the database field names matched the entity and UI rendering logic.





