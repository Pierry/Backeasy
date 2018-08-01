package com.github.pierry.backeasy.core.presentation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.pierry.backeasy.R;

public class BaseActivity extends AppCompatActivity implements IBaseView {

  @BindView(R.id.progressBar) ProgressBar progressBar;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.progress_bar_view);
    ButterKnife.bind(this);
  }

  @Override public void showLoader() {
    runOnUiThread(() -> {
      if (progressBar != null) {
        progressBar.setVisibility(View.VISIBLE);
      }
    });
  }

  @Override public void hideLoader() {
    runOnUiThread(() -> {
      if (progressBar != null) {
        progressBar.setVisibility(View.GONE);
      }
    });
  }

  @Override public void noContent() {
    showToast(getString(R.string.no_content));
  }

  @Override public void noInternet() {
    showToast(getString(R.string.no_internet));
  }

  @Override public void showToast(String msg) {
    runOnUiThread(() -> Toast.makeText(this, msg, Toast.LENGTH_SHORT).show());
  }
}
