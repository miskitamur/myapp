<%@page import=""%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
  <head>
    <meta charset="utf-8">
      <link rel="stylesheet" href="login.css" type="text/css">
  </head>
  <body>
    <h1>ログイン画面</h1>

      <form action = "/tomcat_test/LoginLogic" method="post">
        <div class="label_user">ユーザー名
          <input type="text" name="username" value="">
        </div>
        <div class="label_pass">パスワード
          <input type="password" name="password" value="">
        </div>
      <input type ="submit" value ="ログイン">
      </form>
  </body>
</html>
