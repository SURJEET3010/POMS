<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ page import="java.sql.*" %>
<%@ page import="java.io.IOException" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Orders </title>


          <!-- Google Fonts -->
          <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    
          <!-- Vendor CSS Files -->
          <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
          <link href="assets/vendor/aos/aos.css" rel="stylesheet">
          <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
          <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
          <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
          <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
          <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        
          <!-- Template Main CSS File -->
          <link href="assets/css/style.css" rel="stylesheet">
          <link rel="stylesheet" href="style.css">
          <link href="assets/css/profile.css" rel="stylesheet">
    
</head>

<body style="background-image: url('https://images.unsplash.com/photo-1453614512568-c4024d13c247?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80'); background-repeat: no-repeat; background-size: cover;">

  <!-- ======= Top Bar ======= -->
  <div id="topbar" class="d-flex align-items-center fixed-top">
    <div class="container d-flex justify-content-center justify-content-md-between">
      
    </div>
  </div>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-cente">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">
      <h1 class="logo me-auto me-lg-0"><a href="index.html">Your orders</a></h1>    
      <nav id="navbar" class="navbar order-last order-lg-0">
         <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>
    </div>
  </header><!-- End Header -->
  
  
  <style>
   .card-body{
  border:  rgba(10, 9, 2, 0.971);
  background-color:  rgba(10, 9, 2, 0.734);
  padding-left: 30px;
  padding-top: 34px;
  padding-bottom: 20px;
  padding-right: 30px;
  margin-left: 200px;
  margin-right: auto;
  
}
</style>


	

  <section id="adminPage" class="d-flex align-items-center">
    <div class="adminPage" style="margin-top: 100px;" style="background-color: rgba(3, 242, 178, 0.789);" >
       <!-- <div class="card card-info"> -->
      <div class="card-body" >
       <div class="col-md-12 table-responsive">
          <table id="example1" class="table table-bordered" style="color: white;">
             <thead>
                <tr>
                   <th>Order Id</th>
                   <th>Description</th>
                   <th>Order Date</th>
                   <th>Amount</th>
                   <th>Payment Mode</th>
                   <th>Card no.</th>
                   <th>Address</th>
                 
                </tr>
             </thead>
             <tbody>
             
          <%
         Connection connection = null;
         Statement statement = null;
		 String  id = (String) request.getAttribute("Customer_Id");
		 String  dbAdmin = (String) request.getAttribute("admin");
		 String  password = (String) request.getAttribute("password");

         		try {

         			Class.forName("com.mysql.cj.jdbc.Driver");
         			String url = "jdbc:mysql://localhost/poms";
         			connection = DriverManager.getConnection(url, dbAdmin, password);
         			statement = connection.createStatement();
         			ResultSet resultSet = statement
         					.executeQuery("select * from orders where  customer_id = '" +id + "'");
                    
         			while (resultSet.next()) {
         %>
            
                <tr>
                   <td><% out.println(resultSet.getString("Order_id")); %></td>
                   <td><% out.println(resultSet.getString("Description")); %></td>
                   <td><% out.println(resultSet.getString("order_date")); %></td>
                   <td><% out.println(resultSet.getString("amount")); %></td>
                   <td><% out.println(resultSet.getString("payment_mode")); %></td>
                   <td><% out.println(resultSet.getString("card_no")); %></td>
                   <td><% out.println(resultSet.getString("address")); %></td>
                   
                   
                </tr>
                  
                  
	<% 
		}
          }catch(Exception e)
         	{
      		e.printStackTrace();
       		}
      %>
                </tbody>
          </table>
          
          <button class="btn">View More</button>
       </div>
    </div>
    </div>
    

<!-- /.card-body -->

<!-- /.container-fluid -->
</section>

