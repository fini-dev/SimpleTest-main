package org.com.testing.with.simpletest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val TAG = MainViewModel::class.java.simpleName

    private var _data = MutableLiveData<List<Article>>()
    val data: LiveData<List<Article>>
        get() = _data

    init {
        fetchData()
    }

    /**
     * TODO: Please do reverse the list when presented in UI
     * */
    private fun fetchData() = viewModelScope.launch(Dispatchers.IO) {
        val lstRes = mutableListOf(
            Article(
                title = "Name 1",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 2",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 3",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 4",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 5",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 6",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 7",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 8",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 9",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
            Article(
                title = "Name 10",
                content = "The PNG format is widely supported and works best with presentations and web design. ",
                imageURL = "https://cdn4.iconfinder.com/data/icons/bettericons/354/github-512.png"
            ),
        )
        _data.postValue(lstRes)
    }

}