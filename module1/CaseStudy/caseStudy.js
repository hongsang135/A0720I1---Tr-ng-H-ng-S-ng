let Bar = {
    width : "100",
    height: "10",
    color: "blue",
    left: "200",
    top: "540",
    moveRight: function () {
        this.left=parseInt(this.left)+5;
    },
    moveLeft: function () {
        this.left-=5;
    },
    draw : function (context) {
        context.beginPath();
        context.rect(this.left, this.top, this.width, this.height);
        context.fillStyle = Bar.color;
        context.fill();
    }
};
let Ball = {
    left : "250",
    top : "30",
    radius : "10",
    color: "",
    goc: "",
    speed : "4",
    leftJump: "1",
    topJump: "1",
    randomColor: function () {
        let letters = '0123456789ABCDEF';
        let color = '#';
        for (let i = 0; i < 6; i++) {
            color += letters[Math.floor(Math.random() * 16)];
        }
        this.color = color;
        return this.color;
    },
    move: function () {
        this.left = parseInt(this.left)+parseInt(this.leftJump)*parseInt(this.speed);
        this.top = parseInt(this.top)+parseInt(this.topJump)*parseInt(this.speed);
    },
    draw : function (context) {
        context.beginPath();
        context.arc(this.left, this.top, this.radius,0, 2*Math.PI);
        context.fillStyle = this.randomColor();
        context.fill();
    },
    chanceQuarter:  function (edge) {
        switch (edge) {
            case "R": {
                this.leftJump *= -1;
                break;
            }
            case "L": {
                this.leftJump *= -1;
                break;
            }
            case "T": {
                this.topJump *= -1;
                break;
            }
            case "B": {
                this.topJump *= -1;
                break;
            }
        }
    }

};
let canvas = document.getElementById("myCanvas");
let context = canvas.getContext("2d");
let score = 0;
let time;
let text;
let textMetrics;
Bar.draw(context);
Ball.draw(context);
writeText();
//vẽ dòng nhấn phím enter để bắt đầu
function writeText() {
    context.font = "20px Arial";
    text = "Press Enter to play!";
    textMetrics = context.measureText(text);
    context.fillStyle = "red";
    context.fillText(text, canvas.scrollWidth / 2 - textMetrics.width / 2, canvas.scrollHeight / 4 * 3);
}
function docReady() {
    window.addEventListener('keydown', moveSelection);
}
function moveSelection(evt) {
    switch (evt.keyCode) {
        case 37:
            if(Bar.left>0) {
                context.clearRect(0, 0, canvas.width, canvas.height);
                Bar.moveLeft();
                Bar.draw(context);
                Ball.draw(context);
            }
            break;
        case 39:
            if((parseInt(Bar.left)+parseInt(Bar.width))<canvas.scrollWidth) {
                context.clearRect(0, 0, canvas.width, canvas.height);
                Bar.moveRight();
                Bar.draw(context);
                Ball.draw(context);
            }
            break;
        case 13:
            score = 0;
            context.clearRect(0, 0, canvas.width, canvas.height);
            Ball.left = 250;
            Ball.top = 50;
            Bar.draw(context);
            Ball.draw(context);
            time = setInterval(main, 15);
            break;
    }
}
function main() {
    context.clearRect(0, 0, canvas.width, canvas.height);
    Ball.move();
    Ball.draw(context);
    Bar.draw(context);


    context.font = "30px Arial";
    let scoreText = "SCORE: " + score.toString();
    context.fillText(scoreText, canvas.scrollWidth / 2 - context.measureText(scoreText).width / 2, 50);

    if (parseInt(Ball.left) + parseInt(Ball.radius) >= canvas.scrollWidth) {
        Ball.chanceQuarter("R");
    } else if (parseInt(Ball.left) - parseInt(Ball.radius) <= 0) {
        Ball.chanceQuarter("L");
    } else if (parseInt(Ball.top) - parseInt(Ball.radius) <= 0) {
        Ball.chanceQuarter("T");
    } else if ((parseInt(Ball.top) + parseInt(Ball.radius) >= canvas.scrollHeight) ||
        ((parseInt(Ball.left) > parseInt(Bar.left) ) &&
        (parseInt(Ball.left) < parseInt(Bar.left) + parseInt(Bar.width))&&
        (parseInt(Ball.top) + parseInt(Ball.radius)) >= parseInt(Bar.top))) {
        score++;
        Ball.chanceQuarter("B")
    }
    if((parseInt(Ball.top) + parseInt(Ball.radius)) >= (parseInt(Bar.top)+30)){
        clearInterval(time);
        writeText();
        docReady();
    }
}

