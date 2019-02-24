<!DOCTYPE html>
<html>
<head>
  <title>Add Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body> 
<h2> Add Product </h2>
<br>
<form>
  <div class="form-group">
    <label for="category">Category</label> 
<div class="dropdown">
    <button class="btn btn-info dropdown-toggle" type="button" data-toggle="dropdown">Choose Category
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">TextBook</a></li>
      <li><a href="#">Entrance Book</a></li>
      <li><a href="#">Novels</a></li>
    </ul>
  </div>
  <div class="form-group">
 <label for="price">Price</label>
    <input type="text" class="form-control" id="price" placeholder="Enter Price">
    
  </div>
 <div class="form-group">
 <label for="productdescription">Product Description</label>
    <input type="text" class="form-control" id="productdescription" placeholder="Enter Product Description">
   </div>
<div class="form-group">
 <label for="productname">Product Name</label>
    <input type="text" class="form-control" id="productname" placeholder="Enter Product Name">
   </div>
<div class="form-group">
 <label for="stock">Stock</label>
    <input type="text" class="form-control" id="stock" placeholder="Enter Stock">
   </div>
<div class="form-group">
 <label for="suppliername">Supplier Name</label>
    <input type="text" class="form-control" id="suppliername" placeholder="Enter Supplier Name">
   </div><br>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>