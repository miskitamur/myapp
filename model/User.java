package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{
  private String userID;
  private String name;
  private String pass;
  private String role;

  public User() {

  }

  public User(String userId,String pass) {
    this.userID=userID;
    this.pass=pass;
  }

  public String getUserID() {
    return userID;
  }

  public String getName() {
    return name;
  }

  public String getPass() {
    return pass;
  }

  public String getRole() {
    return role;
  }

  public void setName() {
    //テスト用
    this.name = "テスト名前";
  }

  public void setRole() {
    //テスト用
    this.role = "ALL";
  }

  public boolean checkPass() {
    //テスト用
    return !(pass.isEmpty() && "".equals(pass));
  }
}
