<%-- 
    Document   : index
    Created on : 21 Aug, 2018, 2:54:40 PM
    Author     : Vasu Rajput
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myapp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
              rel="stylesheet">
        <script src="webjars/angularjs/1.7.0/angular.min.js"></script>
        <script src="js/mycontroller.js"></script>
    </head>
    <body ng-controller="myctrl">

        <h1><center>Jsp Using Angular Js</center></h1>
        <div class="jumbotron">
            <center><u>EXample Of 2 Way Binding</u></center>
            <div class="col-md-6">
                Ng-Model <input type="text" class="foem-control" ng-model="myAngularModel">
                </br>
                You Typed: {{myAngularModel}}
            </div>
        </div>


        <script src="webjars/jquery/3.3.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    </body>
</html>
