
let checkData = true;  //kiểm tra dữ liệu đã được nhập đủ chưa
function menu() {
    let option = prompt("Please choose:\n1.Show Information Customer.\n2.Edit Information Customer.\n3.Show the amount to be paid after discount")
    switch(option){
        case '1':{
            showInformation();
            break;
        }
        case '2':{
            break;
        }
        case '3':{
            showAmountAfterDiscount();
            break;
        }
    }
}
function showInformation() {
    //lấy dữ liệu từ forms
    let fullName = document.forms["formInfoCustomer"]["name"];
    let idCard = document.forms["formInfoCustomer"]["idCard"];
    let birthday = document.forms["formInfoCustomer"]["birthday"];
    let email = document.forms["formInfoCustomer"]["email"];
    let addressCustomer = document.forms["formInfoCustomer"]["address"];
    let typeOfCustomer = document.forms["formInfoCustomer"]["typeOfCustomer"];
    let amountOfPeople = document.forms["formInfoCustomer"]["amountOfPeople"];
    let renDays = document.forms["formInfoCustomer"]["renDays"];
    let typeOfRoom = document.forms["formInfoCustomer"]["typeOfRoom"];
    let typeOfService = document.forms["formInfoCustomer"]["typeOfService"];
    //kiểm tra giá trị
    if(fullName.value === "" || idCard.value === "" || birthday.value === "" ||
        email.value === "" || addressCustomer.value === "" || amountOfPeople.value === "" || renDays.value === "" ){
        checkData = false;
        alert("You must enter all value ")
    }else {
        checkData = true;
        document.getElementById("dislayInformation").innerHTML = "<h2>Thông tin khách hàng</h2>"
            + "<table class='tableOutput'>" +
            "<tr>" + "<td>Full name</td>" + "<td>" + fullName.value + "</td>" +
            "<tr>" + "<td>ID Card</td>" + "<td>" + idCard.value + "</td>" +
            "<tr>" + "<td>Birthday</td>" + "<td>" + birthday.value + "</td>" +
            "<tr>" + "<td>Email</td>" + "<td>" + email.value + "</td>" +
            "<tr>" + "<td>Address</td>" + "<td>" + addressCustomer.value + "</td>" +
            "<tr>" + "<td>Type of Customer</td>" + "<td>" + typeOfCustomer.value + "</td>" +
            /*"<tr>" + "<td>Discount</td>" + "<td>" + discount.value + "</td>" +*/
            "<tr>" + "<td>Amount of people</td>" + "<td>" + amountOfPeople.value + "</td>" +
            "<tr>" + "<td>Rendays</td>" + "<td>" + renDays.value + "</td>" +
            "<tr>" + "<td>Type of room</td>" + "<td>" + typeOfRoom.value + "</td>" +
            "<tr>" + "<td>Type of service</td>" + "<td>" + typeOfService.value + "</td>" +
            /*"<tr class='totalPay'>" + "<td>TOTAL PAY</td>" + "<td>" + totalPay + "</td>" +*/
            "</table>"
    }
}
function showAmountAfterDiscount() {
    let fullName = document.forms["formInfoCustomer"]["name"];
    let idCard = document.forms["formInfoCustomer"]["idCard"];
    let birthday = document.forms["formInfoCustomer"]["birthday"];
    let email = document.forms["formInfoCustomer"]["email"];
    let addressCustomer = document.forms["formInfoCustomer"]["address"];
    let typeOfCustomer = document.forms["formInfoCustomer"]["typeOfCustomer"];
    /*let discount = document.forms["formInfoCustomer"]["discount"];*/
    let amountOfPeople = document.forms["formInfoCustomer"]["amountOfPeople"];
    let renDays = document.forms["formInfoCustomer"]["renDays"];
    let typeOfRoom = document.forms["formInfoCustomer"]["typeOfRoom"];
    let typeOfService = document.forms["formInfoCustomer"]["typeOfService"];
    let discount = 0;                   //tổng số tiền giảm giá
    let pricesOfServices = 0;           //giá dịch vụ
    let discountByAddress = 0;          //giảm giá theo địa chỉ
    let discountByRenDays = 0;          //giảm giá theo số ngày thuê
    let discountByTypeOfCustomer = 0;   //giảm giá theo loại khách hàng
    let totalOfMoney = 0;               //tổng tiền
    //tính giá từng loại dịch vụ
    if (typeOfService.value === "Villa")
        pricesOfServices = 500;
    else if (typeOfService.value === "House")
        pricesOfServices = 300;
    else pricesOfServices = 100;
    //tính giảm giá theo địa chỉ
    if (addressCustomer.value === 'Đà Nẵng') {
        discountByAddress = 20;
    } else if (addressCustomer.value === 'Huế') {
        discountByAddress = 10;
    } else if (addressCustomer.value === 'Quảng Nam') {
        discountByAddress = 5;
    }
    //tính giảm giá theo số ngày thuê
    if(renDays.value > 7 ){
        discountByRenDays = 30;
    } else if(renDays.value > 5 ){
        discountByRenDays = 20;
    } else if(renDays.value > 2 ){
        discountByRenDays = 10;
    }
    //tính giảm giá theo loại khách hàng
    if (typeOfCustomer.value == "Diamond") {
        discountByTypeOfCustomer = 15;
    } else if (typeOfCustomer.value == "Platinum") {
        discountByTypeOfCustomer = 10;
    } else if (typeOfCustomer.value == "Gold") {
        discountByTypeOfCustomer = 5;
    } else if (typeOfCustomer.value == "Silver") {
        discountByTypeOfCustomer = 2;
    }
    //tính tổng số tiefn giảm giá
    discount = discountByAddress + discountByRenDays + discountByTypeOfCustomer ;
    totalOfMoney = pricesOfServices * renDays.value - discount;
    //hiển thị ra màn hình
    showInformation();
    if(checkData) {
        document.getElementById("dislayTotalOfMoney").innerHTML = "<h2>Thông tin giảm giá và thanh toán</h2>"
            + "<table class='tableOutput'>" +
            "<tr>" + "<td>Prices Of Services</td>" + "<td>" + pricesOfServices + '$' + "</td>" +
            "<tr>" + "<td>Rendays</td>" + "<td>" + renDays.value + ' Days' + "</td>" +
            "<tr>" + "<td>Discount By Address</td>" + "<td>" + discountByAddress + '$' + "</td>" +
            "<tr>" + "<td>Discount By RenDays</td>" + "<td>" + discountByRenDays + '$' + "</td>" +
            "<tr>" + "<td>Discount By Type Of Customer</td>" + "<td>" + discountByTypeOfCustomer + '$' + "</td>" +
            "<tr>" + "<td>Discount</td>" + "<td>" + discount + '$' + "</td>" +
            "<tr class='totalPay'>" + "<td>Total Of Money</td>" + "<td>" + totalOfMoney + '$' + "</td>" +
            "</table>"
    }
}
