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
let checkData = true;  //kiểm tra dữ liệu đã được nhập đủ chưa
function menu() {
    document.getElementById("errorEmail").innerHTML = "";
    document.getElementById("errorIdCard").innerHTML = "";
    document.getElementById("errorBirthday").innerHTML = "";
    document.getElementById("errorRendays").innerHTML = "";
    document.getElementById("errorAmountOfPeople").innerHTML = "";
    if (fullName.value === "" || idCard.value === "" || birthday.value === "" ||
        email.value === "" || addressCustomer.value === "" || amountOfPeople.value === "" || renDays.value === "") {
        checkData = false;
        alert("You must enter all value ")
    } else {
        checkData = true;
        let checkEmail = false;
        let countAt = 0;   //đếm ký tự @
        let countDot = 0;   //đến ký tự dấu .
        while (!checkEmail){
            let tempEmail = email.value;
            for(let i = 0; i < tempEmail.length; i++){
                //hàm charAt để lấy ký tự thứ i trong chuỗi email
                if(tempEmail.charAt(i) === '@'){
                    countAt++;
                    for(let j = i+1; j< tempEmail.length; j++){
                        if(tempEmail.charAt(j) ==="."){
                            countDot++;
                        }
                    }
                }
            }
            if(countAt != 1 || countDot < 1){
                document.getElementById("errorEmail").innerHTML = "nhập sai định dạng email ***@***.***";
                break;
            }else{
                checkEmail = true;
            }
        }
        let checkId = false;
        while(!checkId){
            let tempId = idCard.value;
            if(!isNaN(tempId)){
                tempId = parseFloat(tempId);
            }
            if(!Number.isInteger(tempId)){
                document.getElementById("errorIdCard").innerHTML = "Nhập sai định dạng idCard";
                break;
            }else if(tempId < 10000000 || tempId > 99999999){
                document.getElementById("errorIdCard").innerHTML = "Nhập sai định dạng idCard";
                break;
            }
            checkId = true;
        }
        let checkBirthday = false;
        while (!checkBirthday){
            let temBirthday = birthday.value;
            if(temBirthday.charAt(2) === "/" && temBirthday.charAt(5) === "/"){
                let day = temBirthday.substring(0,2);
                let month = temBirthday.substring(3, 5);
                let year = temBirthday.substring(6,10);
                if(!isNaN(day) && !isNaN(month) && !isNaN(year)){
                    day = parseFloat(day);
                    month = parseFloat(month);
                    year = parseFloat(year);
                    if(Number.isInteger(day) && Number.isInteger(month) && Number.isInteger(year)){
                        if(day<32 && month<13 && year > 1900 && year < 2020){
                            checkBirthday = true;
                        }
                    }
                }
            }
            if(checkBirthday == false){
                document.getElementById("errorBirthday").innerHTML = "lỗi nhập định dạng ngày sinh (dd/mm/yyyy)";
                break;
            }
        }
        let checkRendays = false;
        while(!checkRendays){
            let tempRendays = renDays.value;
            if(!isNaN(tempRendays)){
                tempRendays = parseFloat(tempRendays);
                if(Number.isInteger(tempRendays) && tempRendays > 0){
                    checkRendays = true;
                }
            }
            if(checkRendays === false){
                document.getElementById("errorRendays").innerHTML = "lỗi định dạng, mời nhập lại";
                break;
            }
        }
        let checkAmountOfPeople = false;
        while(!checkAmountOfPeople){
            let tempAmountOfPeople = amountOfPeople.value;
            if(!isNaN(tempAmountOfPeople)){
                tempAmountOfPeople = parseFloat(tempAmountOfPeople);
                if(Number.isInteger(tempAmountOfPeople) && tempAmountOfPeople > 0){
                    checkAmountOfPeople = true;
                }
            }
            if(checkAmountOfPeople === false){
                document.getElementById("errorAmountOfPeople").innerHTML = "lỗi định dạng, mời nhập lại";
                break;
            }
        }
        if( checkEmail === true && checkId === true && checkBirthday === true && checkRendays === true && checkAmountOfPeople === true ) {
            let option = prompt("Please choose:\n1.Show Information Customer.\n2.Edit Information Customer.\n3.Show the amount to be paid after discount");
            switch (option) {
                case '1': {
                    showInformation();
                    break;
                }
                case '2': {
                    break;
                }
                case '3': {
                    showAmountAfterDiscount();
                    break;
                }
                default: {
                    alert("Please choose again")
                }
            }
        }
    }
}
function showInformation() {
    let tempName = "";
    fullName.value = fullName.value.trim().toLowerCase();
    for(let i=0; i< fullName.value.length; i++){
        if(fullName.value.charAt(i) === " " && fullName.value.charAt(i+1) === " "){
            continue;
        }
        if( i === 0 || fullName.value.charAt(i-1) === " "){
            tempName += fullName.value.charAt(i).toUpperCase();
            continue;
        }
        tempName += fullName.value.charAt(i);
    }
    fullName.value = tempName;
    let tempAddress = "";
    addressCustomer.value = addressCustomer.value.trim().toLowerCase();
    for(let i=0; i< addressCustomer.value.length; i++){
        if(addressCustomer.value.charAt(i) === " " && addressCustomer.value.charAt(i+1) === " "){
            continue;
        }
        if( i === 0 || addressCustomer.value.charAt(i-1) === " "){
            tempAddress += addressCustomer.value.charAt(i).toUpperCase();
            continue;
        }
        tempAddress += addressCustomer.value.charAt(i);
    }
    addressCustomer.value = tempAddress;
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
function showAmountAfterDiscount() {
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
    if (renDays.value > 7) {
        discountByRenDays = 30;
    } else if (renDays.value > 5) {
        discountByRenDays = 20;
    } else if (renDays.value > 2) {
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
    discount = discountByAddress + discountByRenDays + discountByTypeOfCustomer;
    totalOfMoney = pricesOfServices * renDays.value - discount;
    //hiển thị ra màn hình
    showInformation();
    if (checkData) {
        document.getElementById("dislayTotalOfMoney").innerHTML = "<h2>Thông tin giảm giá và thanh toán</h2>"
            + "<table class='tableOutput'>" +
            "<tr>" + "<td>Prices Of Services</td>" + "<td>" + pricesOfServices + '$' + "</td>" +
            "<tr>" + "<td>Rendays</td>" + "<td>" + renDays.value + ' Days' + "</td>" +
            "<tr>" + "<td>Discount By Address</td>" + "<td>" + discountByAddress + '$' + "</td>" +
            "<tr>" + "<td>Discount By RenDays</td>" + "<td>" + discountByRenDays + '$' + "</td>" +
            "<tr>" + "<td>Discount By Type Of Customer</td>" + "<td>" + discountByTypeOfCustomer + '$' + "</td>" +
            "<tr>" + "<td>Discount</td>" + "<td>" + discount + '$' + "</td>" +
            "<tr class='totalPay'>" + "<td>Total Of Money</td>" + "<td>" + totalOfMoney + '$' + "</td>" +
            "</table>";
    }
}