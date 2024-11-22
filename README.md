
Rick and Morty Android App- Authored DALESH PRASHAR

### What Does This PR Do?
- Adds a RecyclerView adapter to display Rick and Morty characters.
- Implements a bottom sheet for showing detailed information on character selection.



### Screenshots 
| Feature  | Screenshot |
<img width="535" alt="Screenshot 2024-11-21 at 7 26 53 PM" src="https://github.com/user-attachments/assets/f7cac0c3-b9f8-4a1e-9a0c-460abab2882a">

|----------|------------|
| Character List | 




<img width="522" alt="Screenshot 2024-11-21 at 7 26 43 PM" src="https://github.com/user-attachments/assets/cc752005-d005-4b8a-ad5b-97ca15331d29">

| Bottom Sheet | 


### Key Changes
1. Created `CharacterAdapter.kt` for managing character data in a RecyclerView.
2. Integrated a `BottomSheetDialog` for character details.


Tech Practise used

As a developer, I used CharacterAdapter to populate the RecyclerView with data fetched via RetrofitClient. The CharacterRepository ensured data flow between the API and CharacterViewModel, which updated the UI seamlessly. I styled the app with Color.kt and Type.kt for a clean and consistent theme. Finally, I added a BottomSheetDialog to display character details interactively, making the experience both functional and user-friendly.
