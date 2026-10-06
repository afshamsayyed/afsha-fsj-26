function toggleTheme() {

    document.body.classList.toggle("dark");

    const button = document.querySelector(".socials button");

    if (document.body.classList.contains("dark")) {
        button.innerHTML = "☀";
    } else {
        button.innerHTML = "☾";
    }
}


function validateForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message").value.trim();

    let result = document.getElementById("formMessage");


    if (name === "" || email === "" || message === "") {

        result.innerHTML = "Please fill all the fields.";
        result.style.color = "red";

        return false;
    }


    result.innerHTML = "Message submitted successfully!";
    result.style.color = "#00a889";

    return false;
}