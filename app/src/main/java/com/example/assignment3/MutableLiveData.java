private final MutableLiveData<String> inputText = new MutableLiveData<>();

public void setInputText(String text) {
    inputText.setValue(text);
}

public LiveData<String> getInputText() {
    return inputText;
}
