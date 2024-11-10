public class UserViewModel extends ViewModel {
    private final MutableLiveData<List<String>> userList = new MutableLiveData<>(new ArrayList<>());

    public LiveData<List<String>> getUserList() {
        return userList;
    }

    public void addUser(String user) {
        List<String> currentList = userList.getValue();
        if (currentList != null) {
            currentList.add(user);
            userList.setValue(currentList);
        }
    }
}
