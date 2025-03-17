package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DifferentLocators {
    WebDriver driver;

    void headingLocator() {
        WebElement heading_1 = driver.findElement(By.className("display-4"));
        WebElement heading_2 = driver.findElement(By.cssSelector(".display-4"));
        WebElement heading_3 = driver.findElement(By.cssSelector("h1.display-4"));
        WebElement heading_4 = driver.findElement(By.cssSelector(".col .display-4"));
        WebElement heading_5 = driver.findElement(By.cssSelector("div.col.col-10 > h1"));

        WebElement heading_6 = driver.findElement(By.xpath("//h1[@class = 'display-4']"));
        WebElement heading_7 = driver.findElement(By.xpath("//h1[text() = 'Hands-On Selenium WebDriver with Java']"));
        WebElement heading_8 = driver.findElement(By.xpath("//div/h1[@class = 'display-4']"));
        WebElement heading_9 = driver.findElement(By.xpath("//h1[@class='display-4']/.."));
        WebElement heading_10 = driver.findElement(By.xpath("//h1[@class='display-4' and text() = 'Hands-On Selenium WebDriver with Java']"));
        WebElement heading_11 = driver.findElement(By.xpath("//h1[@class='display-4' or text() = 'Hands-On Selenium WebDriver with Java']"));
    }

    void titleLocator() {
        WebElement practiceSite_1 = driver.findElement(By.tagName("h5"));
        WebElement practiceSite_2 = driver.findElement(By.cssSelector("h5"));
        WebElement practiceSite_3 = driver.findElement(By.cssSelector("div.col.col-10 > h5"));
        WebElement practiceSite_4 = driver.findElement(By.xpath("//h5"));
        WebElement practiceSite_5 = driver.findElement(By.xpath("//h5[text() = 'Practice site']"));
        WebElement practiceSite_6 = driver.findElement(By.xpath("//div/h5[text() ='Practice site']"));
    }

    void imageLocator() {
        WebElement image_1 = driver.findElement(By.tagName("img"));
        WebElement image_2 = driver.findElement(By.className("img-fluid"));
        WebElement image_3 = driver.findElement(By.cssSelector("img"));
        WebElement image_4 = driver.findElement(By.cssSelector("div.col.col-2 > a > img"));
        WebElement image_5 = driver.findElement(By.cssSelector("img.img-fluid"));
        WebElement image_6 = driver.findElement(By.cssSelector(".col .img-fluid"));
        WebElement image_7 = driver.findElement(By.xpath("//img"));
        WebElement image_8 = driver.findElement(By.xpath("//img[@class = 'img-fluid']"));
        WebElement image_9 = driver.findElement(By.xpath("//a/img[@class = 'img-fluid']"));
        WebElement image_10 = driver.findElement(By.xpath("//*[@class = 'img-fluid' and @src = 'img/hands-on-icon.png']"));
    }

    void textInputLocator() {
        WebElement textInput_1 = driver.findElement(By.id("my-text-id"));
        WebElement textInput_2 = driver.findElement(By.cssSelector("input#my-text-id"));
        WebElement textInput_3 = driver.findElement(By.cssSelector("#my-text-id"));
        WebElement textInput_4 = driver.findElement(By.cssSelector("[myprop = 'myvalue']"));
        WebElement textInput_5 = driver.findElement(By.cssSelector("input[myprop='myvalue']"));

        WebElement textInput_6 = driver.findElement(By.xpath("//input[@id = 'my-text-id']"));
        WebElement textInput_7 = driver.findElement(By.xpath("//input[@name = 'my-text']"));
        WebElement textInput_8 = driver.findElement(By.xpath("//*[@myprop='myvalue']"));
        WebElement textInput_9 = driver.findElement(By.xpath("//label/input[@id='my-text-id']"));
        WebElement textInput_10 = driver.findElement(By.xpath("//input[@id='my-text-id' and @name = 'my-text']"));
    }

    void passwordLocator() {
        WebElement password_1 = driver.findElement(By.name("my-password"));
        WebElement password_2 = driver.findElement(By.cssSelector("[name = 'my-password']"));
        WebElement password_3 = driver.findElement(By.cssSelector("label:nth-child(2) > input"));
        WebElement password_4 = driver.findElement(By.xpath("//input[@type = 'password']"));
        WebElement password_5 = driver.findElement(By.xpath("//*[@name = 'my-password']"));
        WebElement password_6 = driver.findElement(By.xpath("//*[@class = 'form-control' and @name = 'my-password']"));
        WebElement password_7 = driver.findElement(By.xpath("//*[@type= 'password' or @name = 'my-password']"));
        WebElement password_8 = driver.findElement(By.xpath("//label/input[@name='my-password']"));
    }

    void textareaLocator() {
        WebElement textarea_1 = driver.findElement(By.name("my-textarea"));
        WebElement textarea_2 = driver.findElement(By.cssSelector("[name = 'my-textarea']"));
        WebElement textarea_3 = driver.findElement(By.cssSelector("label:nth-child(3) > textarea"));
        WebElement textarea_4 = driver.findElement(By.xpath("//textarea[@name = 'my-textarea']"));
        WebElement textarea_5 = driver.findElement(By.xpath("//*[@class = 'form-control' and @name = 'my-textarea']"));
        WebElement textarea_6 = driver.findElement(By.xpath("//textarea"));
        WebElement textarea_7 = driver.findElement(By.xpath("//label/textarea[@name='my-textarea']"));
    }

    void disabledInputLocator() {
        WebElement disabledInput_1 = driver.findElement(By.name("my-disabled"));
        WebElement disabledInput_2 = driver.findElement(By.cssSelector("[name = 'my-disabled']"));
        WebElement disabledInput_3 = driver.findElement(By.xpath("//input[@name = 'my-disabled']"));
        WebElement disabledInput_4 = driver.findElement(By.xpath("//*[@type = 'text' and @name = 'my-disabled']"));
        WebElement disabledInput_5 = driver.findElement(By.xpath("//input[@name = 'my-disabled' or text() = 'Disabled input']"));
        WebElement disabledInput_6 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-disabled']"));
        WebElement disabledInput_7 = driver.findElement(By.xpath("//*[@placeholder='Disabled input']"));
        WebElement disabledInput_8 = driver.findElement(By.xpath("//label/input[@name='my-disabled']"));
    }

    void readonlyInputLocator() {
        WebElement readonlyInput_1 = driver.findElement(By.name("my-readonly"));
        WebElement readonlyInput_2 = driver.findElement(By.cssSelector("[name = 'my-readonly']"));
        WebElement readonlyInput_3 = driver.findElement(By.cssSelector("[placeholder = 'Disabled input']"));
        WebElement readonlyInput_4 = driver.findElement(By.xpath("//input[@name = 'my-readonly']"));
        WebElement readonlyInput_5 = driver.findElement(By.xpath("//*[@type = 'text' and @name = 'my-readonly']"));
        WebElement readonlyInput_6 = driver.findElement(By.xpath("//input[@name = 'my-disabled' or text() = 'Readonly input']"));
        WebElement readonlyInput_7 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-readonly']"));
        WebElement readonlyInput_8 = driver.findElement(By.xpath("//*[@value='Readonly input']"));
        WebElement readonlyInput_9 = driver.findElement(By.xpath("//label/input[@name='my-readonly']"));
    }

    void dropdownSelectLocator() {
        WebElement dropdownSelect_1 = driver.findElement(By.name("my-select"));
        WebElement dropdownSelect_2 = driver.findElement(By.className("form-select"));
        WebElement dropdownSelect_3 = driver.findElement(By.cssSelector("[name = 'my-select']"));
        WebElement dropdownSelect_4 = driver.findElement(By.cssSelector(".form-select"));
        WebElement dropdownSelect_5 = driver.findElement(By.xpath("//select[@name = 'my-select']"));
        WebElement dropdownSelect_6 = driver.findElement(By.xpath("//*[@class = 'form-select' and @name = 'my-select']"));
        WebElement dropdownSelect_7 = driver.findElement(By.xpath("//select[@class = 'form-select' or text() = 'Dropdown (select)']"));
        WebElement dropdownSelect_8 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/select[@name = 'my-select']"));
        WebElement dropdownSelect_9 = driver.findElement(By.xpath("//label/select[@name='my-select']"));
    }

    void dropdownDatalistLocator() {
        WebElement dropdownDatalist_1 = driver.findElement(By.name("my-datalist"));
        WebElement dropdownDatalist_2 = driver.findElement(By.cssSelector("[name = 'my-datalist']"));
        WebElement dropdownDatalist_4 = driver.findElement(By.cssSelector("[placeholder='Type to search...']"));
        WebElement dropdownDatalist_5 = driver.findElement(By.cssSelector("input[placeholder='Type to search...']"));
        WebElement dropdownDatalist_6 = driver.findElement(By.xpath("//input[@name = 'my-datalist']"));
        WebElement dropdownDatalist_7 = driver.findElement(By.xpath("//*[@class = 'form-control' and @name = 'my-datalist']"));
        WebElement dropdownDatalist_8 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-datalist']"));
        WebElement dropdownDatalist_9 = driver.findElement(By.xpath("//label/input[@name='my-datalist']"));
    }

    void fileInputLocator() {
        WebElement fileInput_1 = driver.findElement(By.name("my-file"));
        WebElement fileInput_2 = driver.findElement(By.cssSelector("[name = 'my-file']"));
        WebElement fileInput_3 = driver.findElement(By.cssSelector("div:nth-child(2) > label:nth-child(3)"));
        WebElement fileInput_4 = driver.findElement(By.xpath("//input[@name = 'my-file']"));
        WebElement fileInput_5 = driver.findElement(By.xpath("//*[@class = 'form-control' and @name = 'my-file']"));
        WebElement fileInput_6 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-file']"));
        WebElement fileInput_7 = driver.findElement(By.xpath("//label/input[@name='my-file']"));
        WebElement fileInput_8 = driver.findElement(By.xpath("//input[@name='my-file']/.."));
    }

    void checkedCheckboxLocator() {
        WebElement checkedCheckbox_1 = driver.findElement(By.id("my-check-1"));
        WebElement checkedCheckbox_2 = driver.findElement(By.cssSelector("#my-check-1"));
        WebElement checkedCheckbox_3 = driver.findElement(By.cssSelector("input#my-check-1"));
        WebElement checkedCheckbox_4 = driver.findElement(By.xpath("//input[@id = 'my-check-1']"));
        WebElement checkedCheckbox_5 = driver.findElement(By.xpath("//*[@class = 'form-check-input' and @id = 'my-check-1']"));
        WebElement checkedCheckbox_6 = driver.findElement(By.xpath("//label[@class = 'form-check-label w-100']/input[@id = 'my-check-1']"));
        WebElement checkedCheckbox_7 = driver.findElement(By.xpath("//label/input[@id='my-check-1']"));
        WebElement checkedCheckbox_8 = driver.findElement(By.xpath("//input[@id='my-check-1']/.."));
    }

    void defaultCheckboxLocator() {
        WebElement defaultCheckbox_1 = driver.findElement(By.id("my-check-2"));
        WebElement defaultCheckbox_2 = driver.findElement(By.cssSelector("#my-check-2"));
        WebElement defaultCheckbox_3 = driver.findElement(By.cssSelector("input#my-check-2"));
        WebElement defaultCheckbox_4 = driver.findElement(By.xpath("//input[@id = 'my-check-2']"));
        WebElement defaultCheckbox_5 = driver.findElement(By.xpath("//*[@class = 'form-check-input' and @id = 'my-check-2']"));
        WebElement defaultCheckbox_6 = driver.findElement(By.xpath("//label[@class = 'form-check-label w-100']/input[@id = 'my-check-2']"));
        WebElement defaultCheckbox_7 = driver.findElement(By.xpath("//label/input[@id='my-check-2']"));
        WebElement defaultCheckbox_8 = driver.findElement(By.xpath("//input[@id='my-check-2']/.."));
    }

    void checkedRadioLocator() {
        WebElement checkedRadio_1 = driver.findElement(By.id("my-radio-1"));
        WebElement checkedRadio_2 = driver.findElement(By.cssSelector("#my-radio-1"));
        WebElement checkedRadio_3 = driver.findElement(By.cssSelector("input#my-radio-1"));
        WebElement checkedRadio_4 = driver.findElement(By.xpath("//input[@id = 'my-radio-1']"));
        WebElement checkedRadio_5 = driver.findElement(By.xpath("//*[@class = 'form-check-input' and @id = 'my-radio-1']"));
        WebElement checkedRadio_6 = driver.findElement(By.xpath("//label[@class = 'form-check-label w-100']/input[@id = 'my-radio-1']"));
        WebElement checkedRadio_7 = driver.findElement(By.xpath("//label/input[@id='my-radio-1']"));
        WebElement checkedRadio_8 = driver.findElement(By.xpath("//input[@id='my-radio-1']/.."));
    }

    void defaultRadioLocator() {
        WebElement defaultRadio_1 = driver.findElement(By.id("my-radio-2"));
        WebElement defaultRadio_2 = driver.findElement(By.cssSelector("#my-radio-2"));
        WebElement defaultRadio_3 = driver.findElement(By.cssSelector("input#my-radio-2"));
        WebElement defaultRadio_4 = driver.findElement(By.xpath("//input[@id = 'my-radio-2']"));
        WebElement defaultRadio_5 = driver.findElement(By.xpath("//*[@class = 'form-check-input' and @id = 'my-radio-2']"));
        WebElement defaultRadio_6 = driver.findElement(By.xpath("//label[@class = 'form-check-label w-100']/input[@id = 'my-radio-2']"));
        WebElement defaultRadio_7 = driver.findElement(By.xpath("//label/input[@id='my-radio-2']"));
        WebElement defaultRadio_8 = driver.findElement(By.xpath("//input[@id='my-radio-2']/.."));
    }

    void colorPickerLocator() {
        WebElement colorPicker_1 = driver.findElement(By.name("my-colors"));
        WebElement colorPicker_2 = driver.findElement(By.className("form-control form-control-color"));
        WebElement colorPicker_3 = driver.findElement(By.cssSelector("[name = 'my-colors']"));
        WebElement colorPicker_4 = driver.findElement(By.cssSelector(".form-control.form-control-color"));
        WebElement colorPicker_5 = driver.findElement(By.cssSelector("input.form-control.form-control-color"));
        WebElement colorPicker_6 = driver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(1) > input"));
        WebElement colorPicker_7 = driver.findElement(By.xpath("//input[@name = 'my-colors']"));
        WebElement colorPicker_8 = driver.findElement(By.xpath("//*[@class = 'form-control form-control-color' and @name = 'my-colors']"));
        WebElement colorPicker_9 = driver.findElement(By.xpath("//*[@class = 'form-control form-control-color' or @type = 'color']"));
        WebElement colorPicker_10 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-colors']"));
        WebElement colorPicker_11 = driver.findElement(By.xpath("//label/input[@name = 'my-colors']"));
        WebElement colorPicker_12 = driver.findElement(By.xpath("//input[@name = 'my-colors']/.."));
    }

    void datePickerLocator() {
        WebElement datePicker_1 = driver.findElement(By.name("my-date"));
        WebElement datePicker_2 = driver.findElement(By.cssSelector("[name = 'my-date']"));
        WebElement datePicker_3 = driver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(2) > input"));
        WebElement datePicker_4 = driver.findElement(By.xpath("//input[@name = 'my-date']"));
        WebElement datePicker_5 = driver.findElement(By.xpath("//*[@class = 'form-control' and @name = 'my-date']"));
        WebElement datePicker_6 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-date']"));
        WebElement datePicker_7 = driver.findElement(By.xpath("//label/input[@name = 'my-date']"));
        WebElement datePicker_8 = driver.findElement(By.xpath("//input[@name = 'my-date']/.."));
    }

    void exampleRangeLocator() {
        WebElement exampleRange_1 = driver.findElement(By.name("my-range"));
        WebElement exampleRange_2 = driver.findElement(By.className("form-range"));
        WebElement exampleRange_3 = driver.findElement(By.cssSelector("[name = 'my-range']"));
        WebElement exampleRange_4 = driver.findElement(By.cssSelector(".form-range"));
        WebElement exampleRange_5 = driver.findElement(By.cssSelector("input.form-range"));
        WebElement exampleRange_6 = driver.findElement(By.cssSelector("input[value='5']"));
        WebElement exampleRange_7 = driver.findElement(By.cssSelector("[value='5']"));
        WebElement exampleRange_8 = driver.findElement(By.cssSelector(".form-label .form-range"));
        WebElement exampleRange_9 = driver.findElement(By.cssSelector("label.form-label input[type='range']"));
        WebElement exampleRange_10 = driver.findElement(By.cssSelector("div:nth-child(3) > label:nth-child(3) > input"));
        WebElement exampleRange_11 = driver.findElement(By.xpath("//input[@name = 'my-range']"));
        WebElement exampleRange_12 = driver.findElement(By.xpath("//*[@value = '5']"));
        WebElement exampleRange_13 = driver.findElement(By.xpath("//*[@class = 'form-range' and @name = 'my-range']"));
        WebElement exampleRange_14 = driver.findElement(By.xpath("//label[@class = 'form-label w-100']/input[@name = 'my-range']"));
        WebElement exampleRange_15 = driver.findElement(By.xpath("//label/input[@name = 'my-range']"));
        WebElement exampleRange_16 = driver.findElement(By.xpath("//input[@type='range']/.."));
    }

    void submitButtonLocator() {
        WebElement submitButton_1 = driver.findElement(By.className("btn btn-outline-primary mt-3"));
        WebElement submitButton_2 = driver.findElement(By.tagName("button"));
        WebElement submitButton_3 = driver.findElement(By.cssSelector("button"));
        WebElement submitButton_4 = driver.findElement(By.cssSelector("div:nth-child(2) > button"));
        WebElement submitButton_5 = driver.findElement(By.cssSelector("button[type='submit']"));
        WebElement submitButton_6 = driver.findElement(By.cssSelector("button.btn.btn-outline-primary.mt-3"));
        WebElement submitButton_7 = driver.findElement(By.xpath("//button[@type = 'submit']"));
        WebElement submitButton_8 = driver.findElement(By.xpath("//button[text() = 'Submit']"));
        WebElement submitButton_9 = driver.findElement(By.xpath("//*[@class = 'btn btn-outline-primary mt-3' and @type= 'submit']"));
        WebElement submitButton_10 = driver.findElement(By.xpath("//div/button[@type= 'submit']"));
    }
}
