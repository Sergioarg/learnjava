### HTTP Response - Status Codes

| Code Range  | Description   |
| ----------- | ------------- |
| `100 - 199` | Informational |
| `200 - 299` | Successful    |
| `300 - 399` | Redirection   |
| `500 - 599` | Server Error  |

### HTTP Methods - CRUD

| HTTP Method | CRUD Action                              | Type of Mapping  |
| :---------: | ---------------------------------------- | ---------------- |
|   `POST`    | Create a new entiity                     | `@PostMapping`   |
|    `GET`    | Read a list of entities or single entity | `@GetMapping`    |
|    `PUT`    | Update an existing entity                | `@PutMapping`    |
|  `DELETE`   | Delete an existing entity                | `@DeleteMapping` |

### Java JSON Data Binding

1. Data binding is the process of converting JSON data to a JAVA POJO. - This use the Jackson library behind the scenes
   > POJO: Plain Old Java Object

### Anti-Patterns in REST API

- Don't include actions in the endpoint `/api/employeeList`. WRONG

JpaRepository:
   - Crate the CRUD methods extending JpaRepository in the class