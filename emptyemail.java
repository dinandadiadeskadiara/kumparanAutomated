@Test
    public void emptyEmailTest()
    {
    	WebElement companyName = driver.findElement(By.name("username"));
        companyName.sendKeys("Testname");
          
        WebElement fullName = driver.findElement(By.name("name"));
        fullName.sendKeys("test");
         
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("");
                 
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Test123");
    }