# questapp With Java Spring Boot

---

### Requirements

---

- Users should be able to log in.

- Users should be able to post.

- Users should be able to comment on a post.

- Users should be able to like a post.

- System should push notifications.

- System should be available 7/24 with less than %1 down.

### Tech Stack

---
- Java 11
- Spring Boot
- Spring Data JPA
- Restful API
- Spring Security JWT
- ReactJS for [Frontend](https://github.com/talharic/questapp-frontend)

## Installing

--- 

Can be installed and run as:
### Maven
**1. Clone the application**

```bash
git clone https://github.com/talharic/questapp.git
```
**2. Go to the project directory**
```bash
cd questapp
```
**3. Run**
```bash
mvn spring-boot:run
```

## API ENDPOINTS

---
### For UserAPI
- `GET /v1/user/`
- `GET /v1/user/{userId}`
- `POST /v1/user/`
- `PUT /v1/user/{userId}`
- `DELETE /v1/user/{userId}`

### For PostAPI
- `GET /v1/post/`
- `GET /v1/post/{postId}`
- `GET /v1/post?userId={userid}`
- `PUT /v1/post/{postId}`
- `DELETE /v1/post/{postId}`

### For CommentAPI
- `GET /v1/comment/`
- `GET /v1/comment/{commentId}`
- `GET /v1/comment?postId={postId}`
- `GET /v1/comment?userId={userId}`
- `PUT /v1/comment/{commentId}`
- `DELETE /v1/comment/{commentId}`


### For LikeAPI
- `GET /v1/like/`
- `GET /v1/like/{likeId}`
- `GET /v1/like?postId={postId}`
- `GET /v1/like?userId={userId}`
- `PUT /v1/like/{likeId}`
- `DELETE /v1/like/{likeId}`
