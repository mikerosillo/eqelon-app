package com.eqelon;

import com.facebook.react.ReactActivity;
//import org.pgsqlite.SQLitePluginPackage;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript. This is
     * used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "eqelon";
    }

    // @Override
    // protected List<ReactPackage> getPackages() {
    // return Arrays.<ReactPackage>asList(new SQLitePluginPackage(), // register
    // SQLite Plugin here
    // new MainReactPackage());
    // }
}

// protected void onCreate(Bundle savedInstanceState) {
// super.onCreate(savedInstanceState);
// mReactRootView = new ReactRootView(this);
// mReactInstanceManager =
// ReactInstanceManager.builder().setApplication(getApplication())
// .setBundleAssetName("index.android.bundle") // this is dependant on how you
// name you JS files, example
// // assumes index.android.js
// .setJSMainModuleName("index") // this is dependant on how you name you JS
// files, example assumes
// // index.android.js
// .addPackage(new MainReactPackage()).addPackage(new SQLitePluginPackage()) //
// register SQLite Plugin here
// .setUseDeveloperSupport(BuildConfig.DEBUG).setInitialLifecycleState(LifecycleState.RESUMED).build();
// mReactRootView.startReactApplication(mReactInstanceManager, "eqelon", null); //
// change "AwesomeProject" to name of
// // your app
// setContentView(mReactRootView);
// }
