package com.github.pierry.backeasy;

import android.widget.EditText;
import android.widget.Toast;
import com.github.pierry.backeasy.domain.contracts.services.IUserService;
import com.github.pierry.backeasy.domain.entities.User;
import com.google.inject.Inject;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;
import roboguice.activity.RoboActionBarActivity;

@OptionsMenu(R.menu.menu_main) @EActivity(R.layout.activity_main) public class MainActivity
    extends RoboActionBarActivity {

  @ViewById EditText username;
  @ViewById EditText password;
  @ViewById EditText email;

  @Inject IUserService userService;

  @Click void logon() {
    User user =
        userService.authenticate(username.getText().toString(), password.getText().toString());
    if (user == null) {
      userService.create(username.getText().toString(), password.getText().toString(), email.getText().toString());
      Toast.makeText(this, "Usuário criado", Toast.LENGTH_LONG).show();
      clear();
      return;
    }
    fill(user);
  }

  public void clear(){
    username.setText("");
    password.setText("");
    email.setText("");
  }

  public void fill(User user){
    username.setText(user.getUsername());
    password.setText(user.getPassword());
    email.setText(user.getEmail());
  }
}