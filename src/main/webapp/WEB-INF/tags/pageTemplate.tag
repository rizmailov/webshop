<%@ tag description="Overall Page template" pageEncoding="UTF-8" %>
<html>
<meta charset="UTF-8">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Решения для загородных домов</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" type="text/css" href="style.css"/>
</head>

<body>
<div class="navbar navbar-inverse navbar-static-top">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#main_menu">
            <span class="sr-only">Меню</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <%--<div class="navbar-brand">Решения для загородных домов</div>--%>
    </div>
    <div class="collapse navbar-collapse" id="main_menu">
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="catalogue">Каталог<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><li><a href="#">Все категории</a></li></li>
                    <li class="divider"/>
                    <li><li><a href="#">Насосы</a></li></li>
                </ul>
            </li>
            <li><a href="#">Доставка</a></li>
            <li><a href="#">Ответы на вопросы</a></li>
        </ul>
    </div>
</div>
<div class="header container-fluid">
    <div class="row">
        <div class="col-xs-9">
            <a href="index.jsp" class="mainLabel">Решения для загородных домов</a>
        </div>
        <div class="col-xs-3">
            <p>Телефон в СПб:<br/><span id="phone">+7 (812) 659-85-15</span></p>

        </div>
    </div>
    <div class="row">

    </div>
</div>
</div>

<main>
    <div class="container" style="overflow: hidden">
        <jsp:doBody/>
    </div>
</main>

<div class="footer container-fluid">
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>