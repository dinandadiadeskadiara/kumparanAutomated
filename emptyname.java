 public void emptyNameTest()
    {
        WebElement companyName = driver.findElement(By.name("username"));
        companyName.sendKeys("dindadieska");
          
        WebElement fullName = driver.findElement(By.name("name"));
        fullName.sendKeys("");
         
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("dindadieska@gmail.com");
    }