<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>حسابداری ساده</title>

</head>
<body>


<div class="container" dir="rtl">
    <h1>دفتر کل ساده</h1>

</div>

<div class="container" dir="rtl">
    <form action="account" method="post">
        <div class="row">
            <div class="col">
                <select name="day" class="form-select">
                    <option selected>انتخاب روز</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                </select>
            </div>
            <div class="col">
                <select name="month" class="form-select">
                    <option selected>انتخاب ماه</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select>
            </div>
            <div class="col">
                <input name="description" type="text" class="form-control" placeholder="شرح"/>
            </div>
            <div class="col">
                <input name="amount" type="number" class="form-control" placeholder="مبلغ (ریال)"/>
            </div>
            <div class="col">
                <select name="status" class="form-select">
                    <option selected>انتخاب وضعیت</option>
                    <option value="Debit">بدهکار</option>
                    <option value="Credit">بستانکار</option>
                </select>
            </div>
            <div class="col">
                <button type="submit" class="btn btn-primary">ثبت</button>
            </div>
        </div>
    </form>

    <div class="row">
        <div class="col">روز</div>
        <div class="col">ماه</div>
        <div class="col">شرح</div>
        <div class="col">بدهکار</div>
        <div class="col">بستانکار</div>
        <div class="col">باقیمانده</div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>

</body>
</html>