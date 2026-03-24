<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>

<input type="text" id="username" placeholder="Username"><br><br>
<input type="password" id="password" placeholder="Password"><br><br>

<button onclick="login()">Login</button>

<script>
function login() {
    fetch("http://localhost:8080/auth/login", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            username: document.getElementById("username").value,
            password: document.getElementById("password").value
        })
    })
    .then(res => res.json())
    .then(data => {
        if(data.role === "ADMIN") {
            window.location.href = "admin.html";
        } else if(data.role === "USER") {
            window.location.href = "user.html";
        } else {
            alert("Invalid login");
        }
    });
}
</script>

</body>
</html>
