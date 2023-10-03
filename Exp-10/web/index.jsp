<!DOCTYPE html>
<html>
<head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        .form-container {
            padding: 20px; 
        }
    </style>
</head>
<body>
        <br>
        <div class="form-container">
            <form action="update.jsp">
                ID: <input type="text" name="ID"><!-- comment --><br>
                New Name: <input type="text" name="newName"><!-- comment --><br>
                Update: <input type="submit" value="update">
            </form>
        </div>
        <br>
        <div class="form-container">
            <form action="delete.jsp">
                Delete ID: <input type="text" name="ID"><!-- comment --><br>
                Delete: <input type="submit" value="Delete">
            </form>
        </div>
        <br>
        <div class="form-container">
            <form action="create.jsp">
                New ID: <input type="text" name="ID"><!-- comment --><br>
                New Name: <input type="text" name="newName"><!-- comment --><br>
                Create: <input type="submit" value="create">
            </form>
        </div>
        <br>
        <div class="form-container">
            <form action="display.jsp">
                Display: <input type="submit" value="display">
            </form>
        </div>
</body>
</html>
