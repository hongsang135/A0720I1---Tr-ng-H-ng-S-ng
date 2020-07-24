function displayData() {
    //lấy dưc liệu từ forms
    let fullName = document.forms["formInfoCustomer"]["name"];
    let idCard = document.forms["formInfoCustomer"]["idCard"];
    let birthday = document.forms["formInfoCustomer"]["birthday"];
    let email = document.forms["formInfoCustomer"]["email"];
    let addressCustomer = document.forms["formInfoCustomer"]["address"];
    let typeOfCustomer = document.forms["formInfoCustomer"]["typeOfCustomer"];
    let discount = document.forms["formInfoCustomer"]["discount"];
    let amountOfPeople = document.forms["formInfoCustomer"]["amountOfPeople"];
    let renDays = document.forms["formInfoCustomer"]["renDays"];
    let typeOfRoom = document.forms["formInfoCustomer"]["typeOfRoom"];
    let typeOfService = document.forms["formInfoCustomer"]["typeOfService"];

    //tính discount theo loại khách hàng
    if (typeOfCustomer.value == "Diamond")
    {document.getElementById("discount").value = 15;}
    else if (typeOfCustomer.value == "Platinum")
    {document.getElementById("discount").value = 12;}
    else if (typeOfCustomer.value == "Gold")
    {document.getElementById("discount").value = 10;}
    else if (typeOfCustomer.value == "Silver")
    {document.getElementById("discount").value = 5;}
    else
    {document.getElementById("discount").value = 2;}

    //khai báo và gán giá từng loại dịch vụ
    let price;
    if(typeOfService.value == "Villa")
        price = 500;
    else if(typeOfService.value == "House")
        price = 300;
    else price = 100;
    //khai báo và tính tổng tiền phải trả
    let totalPay;
    totalPay = price * renDays.value * ( 1 - discount.value / 100);
   /* alert(totalPay+"$");*/
    //hiển thị thông tin sau khi khách hàng nhập, trả kết quả số tiền khách hàng phải trả
    document.getElementById("outputData").innerHTML = "<h2>Xác nhận đặt phòng và thanh toán</h2>"
        +"<table class='tableOutput'>" +
            "<tr>" + "<td>Full name</td>" + "<td>" + fullName.value + "</td>" +
            "<tr>" + "<td>ID Card</td>" + "<td>" + idCard.value + "</td>" +
            "<tr>" + "<td>Birthday</td>" + "<td>" + birthday.value + "</td>" +
            "<tr>" + "<td>Email</td>" + "<td>" + email.value + "</td>" +
            "<tr>" + "<td>Address</td>" + "<td>" + addressCustomer.value + "</td>" +
            "<tr>" + "<td>Type of Customer</td>" + "<td>" + typeOfCustomer.value + "</td>" +
            "<tr>" + "<td>Discount</td>" + "<td>" + discount.value + "</td>" +
            "<tr>" + "<td>Amount of people</td>" + "<td>" + amountOfPeople.value + "</td>" +
            "<tr>" + "<td>Rendays</td>" + "<td>" + renDays.value + "</td>" +
            "<tr>" + "<td>Type of room</td>" + "<td>" + typeOfRoom.value + "</td>" +
            "<tr>" + "<td>Type of service</td>" + "<td>" + typeOfService.value + "</td>" +
            "<tr class='totalPay'>" + "<td>TOTAL PAY</td>" + "<td>" + totalPay + "</td>" +
        "</table>"

}

