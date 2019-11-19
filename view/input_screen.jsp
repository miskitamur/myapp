<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>案件検索・照会</title>
  </head>
  <body>
    <center>
      <h1>案件検索・紹介</h1>
    </center>
  <div class="titlebar">
    <p class="caseid">案件ID<input type="text/css" name="caseid"></p>
    <p class="casename">案件名<input type="text/css" name="casename"></p>
    <p class="casecategory">案件種別<select name="example">
        <option value="選択肢1">選択肢1</option>
        <option value="選択肢2">選択肢2</option>
        <option value="選択肢3">選択肢3</option>
      </select></p>
  </div>
  <style type="text/css">
    .titlebar { display: table; width: 100%; background-color:#cc0000; color:white; }
    .caseid { display: table-cell; text-align: left; }
    .casename  { display: table-cell; text-align: justify; }
    .casecategory     { display: table-cell; text-align: right; }
  </style><br>
  <div class="titlebar">
    <p class="contract period">契約期間</p>
    <p class="from">from<input type="text/css" size=2 name="from"><input type="text/css" size=2 name="from"><input type="text/css" size=2 name="from"></p>
    <p class="to">to<input type="text/css" size=2 name="to"><input type="text/css" size=2 name="to"><input type="text/css" size=2 name="to"></p>
  </div>
  <style type="text/css">
    .titlebar { display: table; width: 100%; background-color:#cc0000; color:white; }
    .contract period { display: table-cell; text-align: left; }
    .from  { display: table-cell; text-align: center; }
    .to     { display: table-cell; text-align: right; }
  </style><br>
  <div class="titlebar">
    <p class="money">金額<input type="text/css" name="money"></p>
    <p class="responsible">担当者<input type="text/css" name="responsible"></p>
    <p class="search"><input type="submit" value="検索"></p>
  </div>
  <style type="text/css">
    .titlebar { display: table; width: 100%; background-color:#cc0000; color:white; }
    .money { display: table-cell; text-align: left; }
    .responsible  { display: table-cell; text-align: justify; }
    .search     { display: table-cell; text-align: right; }
  </style><br>

  <!--案件ID<input type="text/css" name="id">
  案件名<input type="text" name="id">
  -->
  </body>
</html>
