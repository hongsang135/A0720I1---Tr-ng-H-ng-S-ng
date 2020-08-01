
function calculate(){
    let inputNumber1 = document.forms["calculate"]["Number1"];
    let inputNumber2 = document.forms["calculate"]["Number2"];
    let Number1 = parseFloat(inputNumber1.value);
    let Number2 = parseFloat(inputNumber2.value);
    let calculation = document.getElementById("calculation");
    calculation = calculation.value;
    switch (calculation) {
        case '+':{
            alert("result = " + (Number1 + Number2))
            break;
        }
        case '-':{
            alert("result = " + (Number1 - Number2))
            break;
        }
        case '*':{
            alert("result = " + (Number1 * Number2))
            break;
        }
        case '/':{
            alert("result = " + (Number1 / Number2))
            break;
        }
    }
}
/*
function Subtraction() {
    let inputNumber1 = document.forms["calculate"]["Number1"];
    let inputNumber2 = document.forms["calculate"]["Number2"];
    let Number1 = parseInt(inputNumber1.value);
    let Number2 = parseInt(inputNumber2.value);
    let Sub = Number1 - Number2;
    document.getElementById("showResult").innerHTML = "Result Addition:" + " " +Sub;
}
function Multiplication() {
    let inputNumber1 = document.forms["calculate"]["Number1"];
    let inputNumber2 = document.forms["calculate"]["Number2"];
    let Number1 = parseInt(inputNumber1.value);
    let Number2 = parseInt(inputNumber2.value);
    let Mul = Number1 * Number2;
    document.getElementById("showResult").innerHTML = "Result Addition:" + " " +Mul;
}
function Division() {
    let inputNumber1 = document.forms["calculate"]["Number1"];
    let inputNumber2 = document.forms["calculate"]["Number2"];
    let Number1 = parseInt(inputNumber1.value);
    let Number2 = parseInt(inputNumber2.value);
    let Div = Number1 / Number2;
    document.getElementById("showResult").innerHTML = "Result Addition:" + " " +Div;
}*/
