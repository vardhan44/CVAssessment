const display = document.querySelector(".display");
const operations = document.querySelectorAll("button");
const operators = ["%", "*", "/", "-", "+", "="];
let result = " ";

const calculate = (btnValue) => {
    if(btnValue === "=" && result  !== ""){
         result = eval(result.replace("%", "/100"));
    }
    else if(btnValue === "Ac"){
        result = "";
    }
    else if(btnValue === "Del"){
        result = result.toString().slice(0,-1);
    }
    else{
        if(result==="" && operators.includes(btnValue)) return;
        result += btnValue
    }
    display.value = result;
};

operations.forEach((button) => {
    button.addEventListener("click", (e) => calculate(e.target.dataset.value));
});
