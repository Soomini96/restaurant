sessionStorage.setItem("log",'apple');

function loginCheck(){
    const id = sessionStorage.getItem("log");

    if(id === "" || id === null){
        alert("로그인을 먼저 해주세요.");
    }else{
        location.href = "reviewWrite";
    }
}
