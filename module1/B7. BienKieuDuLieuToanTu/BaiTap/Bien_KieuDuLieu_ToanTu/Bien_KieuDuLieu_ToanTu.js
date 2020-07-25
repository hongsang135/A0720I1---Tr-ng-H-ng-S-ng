function calculate(){
    let chemistry = parseFloat(document.getElementById("chemistry").value);
    let physic = parseFloat(document.getElementById("physic").value);
    let biology = parseFloat(document.getElementById("biology").value);
    sum = chemistry + physic + biology;
    mean = sum / 3;
    alert("tổng điểm là: " + sum);
    alert("điểm trung bình là: " + mean);
}
function temperatureF() {
    let temperatureC = parseFloat(document.getElementById("temperatureC").value);
    temperatureF = ( 9 * temperatureC ) / 5 + 32;
    alert("Độ F là: "+ temperatureF);
}
function perimeter() {
    const PI = 3.14;
    let radius = parseFloat(document.getElementById("radius").value);
    result = 2 * PI * radius;
    alert("chu vi: "+ result);
}
function area() {
    const PI = 3.14;
    let radius = parseFloat(document.getElementById("radius").value);
    result = PI * radius * radius;
    alert("chu vi: "+ result);
}