<table border="1">
<tr><th>ID</th><th>Name</th><th>Dept</th><th>Email</th><th>Action</th></tr>

<tr th:each="s : ${students}">
<td th:text="${s.id}"></td>
<td th:text="${s.name}"></td>
<td th:text="${s.department}"></td>
<td th:text="${s.email}"></td>
<td><a th:href="@{'/admin/delete/' + ${s.id}}">Delete</a></td>
</tr>

</table>
