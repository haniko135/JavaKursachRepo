let i = 0;
function dropMenu(){
    if(document.documentElement.clientWidth > 700){
        if(i == 0){
            document.getElementById("menu").style.width="12%";
            document.body.style.backgroundColor = "rgba(157,157,157,0.7)";
            document.getElementById("menuIcon").style.backgroundColor = "rgba(65, 164, 226, 0.9)";
            document.getElementById("menuBar").style.backgroundColor = "rgba(65, 164, 226, 0.9)";
            i++;
        }
        else if(i == 1){
            document.getElementById("menu").style.width = "0";
            document.body.style.backgroundColor = "";
            document.getElementById("menuIcon").style.backgroundColor = "";
            document.getElementById("menuBar").style.backgroundColor = "";
            i--;
        }
    }
    else if(document.documentElement.clientWidth <= 700){
        if(i == 0){
            document.getElementById("menu").style.width="25%";
            document.body.style.backgroundColor = "rgba(157,157,157,0.7)";
            document.getElementById("menuIcon").style.backgroundColor = "rgba(65, 164, 226, 0.9)";
            document.getElementById("menuBar").style.backgroundColor = "rgba(65, 164, 226, 0.9)";
            i++;
        }
        else if(i == 1){
            document.getElementById("menu").style.width = "0";
            document.body.style.backgroundColor = "";
            document.getElementById("menuIcon").style.backgroundColor = "";
            document.getElementById("menuBar").style.backgroundColor = "";
            i--;
        }
    }
}