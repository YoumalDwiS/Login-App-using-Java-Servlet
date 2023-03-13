
<script src="https://www.google.com/recaptcha/api.js"></script>
<form action="LoginServlet" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>
    <div class="g-recaptcha"
         data-sitekey="6LcZcuEkAAAAAK1ICK-Wtik4L3U68-JqVCB9GUgm"></div>
    <br>
    <input type="submit" value="Login">
</form>