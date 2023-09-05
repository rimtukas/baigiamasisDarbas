# Project Receptorius
## Setup
### Site used for testing
[puiki](https://puiki.lt/)
### Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`
## Test cases
### **Login**
- Test 1 (logIn)

*Log in with existing data*
1. Open main page 
2. Click on button 'Prisijungti'
3. Input Name
4. Input Surname
5. Input e-mail
6. Re-input e-mail
7. Input password
8. Re-input password
9. Click on button 'Išsaugoti informaciją'

Expected result: login succesful
### 
- Test 2 (changeMyAccountInformation)

*Change 'My account' information*
1. Open page 'Mano paskyra'
2. Click button 'Pridėti adresą'
3. Click button 'add new address'
4. Input Name
5. Input Surname
6. Input address
7. Choose country
8. Input Post code
9. Input City
10. Input Phone number
11. Input mobile phone number
12. Click on 'Atnaujinti duomenis' button

Expected result: data insert correctly
- Test 3 (tryToLogInWithExistingAccountInfo)

*Try to log in with existing account information*
1. Open log in page
2. Input email(vismante.lisauskaite@gmail.com) and password(vcsprojektas)
3. Click "Login" button
4. Check if account name(Vismante Lisauskaite) appeared on top and current Url is correct
### Spice Search
- Test 1 (searchForSpicesWithSearchBar)

*Try to search for spices with search bar*
1. Open main page
2. Add spice name(Deggi Mirch) to search bar
3. Click "Search" button
4. Check if spice element(Deggi Mirch) is present
- Test 2 (searchForSpicesWithFilters)

*Try to search for a spice with filters*
1. Drag mouse to section(Produktai)
2. Click on section(Grynieji prieskoniai) that appeared
3. Check if spice element(random) is present on the page
4. Click button "Čili pipirai" from dropdown menu
5. Click on checkbox "Aštrus"
6. Check if spice element(Deggi Mirch) is present and spice element(random) is not 