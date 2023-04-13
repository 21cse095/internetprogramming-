<!DOCTYPE html>  
<html>  
<head>  
<style>
       body{
        background-color: beige;
        color: black;
        margin-left: 100px;
        margin-right: 100px;
    }
    button{
        padding-left: 30px ;
        padding-right: 30px ;
        margin-bottom: 30px;
    }
    span{
        color: red;
    }
 </style>
</head>  
<body>
<?php
$servername = "localhost";
$username = "root";
$password = "";

try {
  $conn = new PDO("mysql:host=$servername;dbname=info", $username, $password);
  $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

} catch(PDOException $e) {
  echo "Connection failed: " . $e->getMessage();
}
?>

<?php

$nameErr = $emailErr =$dateErr ="";
$name = $email=$datetime= "";
if ($_SERVER["REQUEST_METHOD"] == "POST")
{
   if (empty($_POST["name"]))
     {$nameErr = "*Name is required";}
   else
     {
     $name = test_input($_POST["name"]);
     if (!preg_match("/^[a-zA-Z ]*$/",$name))
       {
       $nameErr = "*Only letters and white space allowed";
       }
     }
 
   if (empty($_POST["email"]))
     {$emailErr = "*Email is required";}
   else
     {
     $email = test_input($_POST["email"]);
     if (!preg_match("/([\w\-]+\@[\w\-]+\.[\w\-]+)/",$email))
       {
       $emailErr = "*Invalid email format";
       }
     }
 if (empty($_POST["datetime"]))
     {$dateErr = "*datetime is required";}
     else
     {
     $datetime = test_input($_POST["datetime"]);
     }
   
  }

function test_input($data)
{
     $data = trim($data);
     $data = stripslashes($data);
     $data = htmlspecialchars($data);
     return $data;
}
?>

<center>
   <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" >  
<h3>APPOINTMENT</h3>
    <table cellspacing="30">
        <tr>
            <td>
                <label>NAME: </label>
            </td>
            <td><p>:</p></td>
            <td> <input type="text" name="name">
 <span class="error"><?php echo $nameErr; ?> </span> </td>
   
        </tr>
        <tr>
            <td><label>E-MAIL: </label></td>
            <td><p>:</p></td>
            <td><input type="text" name="email">
<span class="error"><?php echo $emailErr; ?> </span>  </td>
        </tr>
        <tr>
            <td>
                <label>DATE-TIME: </label>
            </td>
            <td><p>:</p></td>
            <td>  <input type="datetime-local" name="datetime">  
      <span class="error"><?php echo $dateErr; ?> </span>
                </td>
        </tr>
       
</table>                            
    <input type="submit" name="submit" value="Submit">  
    <button type="reset">clear</button>                            
</form>  

<?php  
    if(isset($_POST['submit'])) {  
    if($nameErr == "" && $emailErr == "") {  
        echo "<h4> <b>YOU HAVE RECEIVED YOUR APPOINTMENT SUCCESSFULLY!.</b> </h4>";  
        echo "<h2>Your Input:</h2>";  
        echo "NAME: " .$name;  
        echo "<br>";  
        echo "EMAIL: " .$email;  
        echo "<br>";  
        echo "DATE-TIME: " .$datetime;    
    } else {  
        echo "<h3> <b>You didn't filled up the form correctly.</b> </h3>";  
    }  
    }  
?>  
<?php


$sql =" INSERT INTO `info`.`appointment` (
`name` ,
`email` ,
`date&time`
)
VALUES (
'$name', '$email', '$date&time'
)";
if ($conn->query($sql)) {
if (!empty($_POST["name"]) && !empty($_POST["email"]) && !empty($_POST["datetime"]))
{  echo "<br>";
   echo "inserted successfully";
}

} else {
echo "Error inserting in table: " . $conn->error;
}
?>
</center>
</body>
</html>