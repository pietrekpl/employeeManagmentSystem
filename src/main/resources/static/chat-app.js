var user, stompClient;
window.onload = () => {
    user = prompt("Hey, whats your name?", `user-${new Date().getTime()}`);
    document.getElementById('user-name').innerHTML = user;
}

