//package com.rachit2525.annadaata;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.ProgressDialog;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//import com.rachit2525.annadaata.Model.User;
//import com.rengwuxian.materialedittext.MaterialEditText;
//
//public class SignIn extends AppCompatActivity {
//
//    EditText edtPhone, edtPassword;
//    Button btnSignIn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sign_in);
//
//        edtPassword = (MaterialEditText) findViewById(R.id.edtPassword);
//        edtPhone = (MaterialEditText) findViewById(R.id.edtPhone);
//        btnSignIn = (Button) findViewById(R.id.btnSignIn);
//
//        //Initializing Firebase Database
//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        final DatabaseReference table_user = database.getReference("User");
//        btnSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                final ProgressDialog mDialog = new ProgressDialog(SignIn.this);
//                mDialog.setMessage("Please Wait...");
//                mDialog.show();
//
//                table_user.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                        //checking if user not exist in database
//
//                        if (dataSnapshot.child(edtPhone.getText().toString()).exists()) {
//
//                            mDialog.dismiss();
//
//                            //Getting user information
//
//                            User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
//                            if (user.getPassword().equals(edtPassword.getText().toString())) {
//                                Toast.makeText(SignIn.this, "Sign in successful!", Toast.LENGTH_SHORT).show();
//                            } else {
//                                Toast.makeText(SignIn.this, "Sign in failed!", Toast.LENGTH_SHORT).show();
//                            }
//                        } else {
//                            mDialog.dismiss();
//                            Toast.makeText(SignIn.this, "User does not exist in Database!", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
//            }
//        });
//    }
//}
