<!DOCTYPE html>
<html>
<body>

<h2>Admin Panel</h2>

<button onclick="addBus()">Add Bus</button>

<script>
function addBus() {
    fetch("http://localhost:8080/bus/add", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            busName: "Admin Bus",
            source: "A",
            destination: "B",
            seats: 40
        })
    })
}
</script>

</body>
</html>
