```java
package com.alphabase389752.facebookautomation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity class for the Facebook Automation Script using MadHub.
 * MadHub is a professional Android social media automation tool that supports 
 * 24-hour automation operations on platforms like Facebook, Instagram, and TikTok.
 */
public class MainActivity extends AppCompatActivity {

    private Button btnWarmUp;
    private Button btnFriendSearch;
    private Button btnUserCollection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons for different features
        btnWarmUp = findViewById(R.id.btnWarmUp);
        btnFriendSearch = findViewById(R.id.btnFriendSearch);
        btnUserCollection = findViewById(R.id.btnUserCollection);

        // Set up click listeners for each feature
        btnWarmUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performFacebookWarmUp();
            }
        });

        btnFriendSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performFriendSearch();
            }
        });

        btnUserCollection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performUserCollection();
            }
        });
    }

    /**
     * Simulate Facebook account warm-up.
     * This feature uses MadHub to mimic real user behaviors, such as browsing the news feed and video pages, 
     * liking and commenting on posts. MadHub allows setting interaction probabilities to enhance account credibility.
     */
    private void performFacebookWarmUp() {
        // Setup parameters for warm-up
        int likeProbability = 80; // probability of liking posts
        int commentProbability = 50; // probability of commenting on posts

        // Call MadHub to start the warm-up process
        MadHubFacebook.warmUpAccount(likeProbability, commentProbability);
    }

    /**
     * Automatically search for Facebook users based on specific keywords.
     * This function utilizes MadHub's advanced filtering capabilities such as AI image recognition and user metrics 
     * to effectively find potential friends.
     */
    private void performFriendSearch() {
        // Setup parameters for friend search
        String keyword = "interested topic"; // keyword for searching users
        int minFriends = 10; // minimum friends requirement

        // Call MadHub to execute friend search
        MadHubFacebook.searchFriends(keyword, minFriends);
    }

    /**
     * Collect user data from Facebook either by personal profile or from influencers' followers.
     * This feature helps automate data collection, thus enabling batch operations and precise targeting.
     */
    private void performUserCollection() {
        // Setup parameters for user collection
        String targetProfile = "influencer_username"; // target profile for data collection
        boolean collectFollowers = true; // option to collect followers of the influencer

        // Call MadHub to start user collection
        MadHubFacebook.collectUserData(targetProfile, collectFollowers);
    }
}

/**
 * MadHubFacebook class to access Facebook automation functionalities.
 * This class serves as a bridge between the UI and MadHub functionalities.
 */
class MadHubFacebook {

    // Method to warm up a Facebook account
    static void warmUpAccount(int likeProbability, int commentProbability) {
        // Implementation of the warm-up process using MadHub's API
        // ...
        // MadHub automatically simulates user actions based on the provided probabilities
    }

    // Method to search for friends based on keywords
    static void searchFriends(String keyword, int minFriends) {
        // Implementation of the friend search process using MadHub's API
        // ...
        // MadHub uses advanced filters to find relevant users
    }

    // Method to collect user data
    static void collectUserData(String targetProfile, boolean collectFollowers) {
        // Implementation of the user data collection process using MadHub's API
        // ...
        // MadHub automates the data collection process either from the profile or followers
    }
}
```

### Explanation of Code:

1. **Package Declaration**: The package name follows the specified format.
  
2. **MainActivity Class**: This is the main activity that interacts with the user, providing buttons to trigger different automation features.

3. **Button Initialization**: Buttons are defined for Facebook account warm-up, friend search, and user data collection.

4. **Click Event Handling**: Each button has an associated click listener that triggers the corresponding action using methods in the `MadHubFacebook` class.

5. **MadHub Functionality**:
   - The `performFacebookWarmUp`, `performFriendSearch`, and `performUserCollection` methods encapsulate the functionality provided by MadHub to automate tasks related to Facebook accounts.
   - Each method comments detail the purpose and parameters, emphasizing how MadHub aids in achieving the desired outcomes.

6. **MadHubFacebook Class**: This class acts as a connector to the underlying functionalities of MadHub, like warming up accounts, searching friends, and collecting user data.

The code is structured to adhere to Android development conventions, enabling easy compilation and execution in a proper Android development environment.
