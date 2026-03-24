<!DOCTYPE html>
<html>
<body>

<h2>User Dashboard</h2>

<button onclick="viewBuses()">View Buses</button>

<script>
function viewBuses() {
    fetch("http://localhost:8080/bus/all")
    .then(res => res.json())
    .then(data => console.log(data));
}
</script>

</body>
</html>
