package github.farhanroy.whatsappclone.data

data class Chat(
    val id: Int,
    val name: String,
    val time: String,
    val date: String?,
    val lastMessage: String?,
    val imageUrl: String
)

data class Call(
    val id: Int,
    val name: String,
    val date: String,
    val imageUrl: String,
    val isMissCall: Boolean,
    val isIncoming: Boolean,
)

data class Message(
    val message: String,
    val isPeer: Boolean
)

object DummyData {
    val listChat = listOf(
        Chat(
            id = 0,
            name = "Farhan Roy",
            time = "08:46",
            date = "17 june",
            lastMessage = "Assalamualaikum",
            imageUrl = "https://randomuser.me/api/portraits/men/12.jpg"
        ),
        Chat(
            id = 1,
            name = "Leanne Graham",
            time = "12:45",
            date = null,
            lastMessage = "Contrary to popular belief",
            imageUrl = "https://randomuser.me/api/portraits/men/85.jpg"
        ),
        Chat(
            id = 2,
            name = "Ervin Howell",
            time = "Yesterday",
            date = "17 june",
            lastMessage = "Letraset sheets containing Lorem Ipsum passages",
            imageUrl = "https://randomuser.me/api/portraits/men/31.jpg"
        ),
        Chat(
            id = 3,
            name = "Clementine Bauch",
            time = "23:56",
            date = "17 june",
            lastMessage = "There are many variations of passages of Lorem Ipsum available",
            imageUrl = "https://randomuser.me/api/portraits/women/76.jpg"
        ),
        Chat(
            id = 4,
            name = "Patricia Lebsack",
            time = "10/06/2021",
            date = "17 june",
            lastMessage = "randomised words which",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg"
        ),
        Chat(
            id = 5,
            name = "+62 856-7985-723",
            time = "Yesterday",
            date = "17 june",
            lastMessage = "simply dummy text of the printing and typesettin",
            imageUrl = "https://randomuser.me/api/portraits/men/41.jpg"
        ),
        Chat(
            id = 6,
            name = "Chelsey Dietrich",
            time = "09/06/2021",
            date = "17 june",
            lastMessage = "when an unknown printer took",
            imageUrl = "https://randomuser.me/api/portraits/women/31.jpg"
        ),
        Chat(
            id = 7,
            name = "Mohammed salah",
            time = "08:46",
            date = "17 june",
            lastMessage = "Wa'alaikumsalam",
            imageUrl = "https://cdns.klimg.com/bola.net/library/upload/21/2018/07/mo-salah-l_a7e5e57.jpg"
        ),
        Chat(
            id = 8,
            name = "+1 463-123-4447",
            time = "08:46",
            date = "17 june",
            lastMessage = "How are you ?",
            imageUrl = "https://randomuser.me/api/portraits/men/81.jpg"
        ),
    )

    val listCall = listOf(
        Call(
            id = 0,
            name = "Ervin Howell",
            date = "17 june 08.46",
            imageUrl = "https://randomuser.me/api/portraits/men/31.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 1,
            name = "Mohammed salah",
            date = "17 june 07.00",
            imageUrl = "https://cdns.klimg.com/bola.net/library/upload/21/2018/07/mo-salah-l_a7e5e57.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 2,
            name = "+1 463-123-4447",
            date = "15 june 12.11",
            imageUrl = "https://randomuser.me/api/portraits/men/81.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 3,
            name = "Patricia Lebsack",
            date = "15 june 05.09",
            imageUrl = "https://randomuser.me/api/portraits/women/67.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 4,
            name = "Farhan Roy",
            date = "14 june 23.45",
            imageUrl = "https://randomuser.me/api/portraits/men/12.jpg",
            isIncoming = true,
            isMissCall = false
        ),
        Call(
            id = 6,
            name = "Chelsey Dietrich",
            date = "14 june 20.00",
            imageUrl = "https://randomuser.me/api/portraits/women/31.jpg",
            isIncoming = true,
            isMissCall = true
        ),
        Call(
            id = 7,
            name = "+62 856-7985-723",
            date = "14 june 14.30",
            imageUrl = "https://randomuser.me/api/portraits/men/41.jpg",
            isIncoming = true,
            isMissCall = false
        )
    )

    val listMessage = listOf(
        Message("Hi Roy how are you ?", false),
        Message("Iam fine, how are you ?", true),
        Message("Iam fine too", false),
        Message("What do you do now ?", true),
        Message("Write a book, and doing my work", false),
        Message("Wow, its so good man", true),
        Message("Yeah", false),
    )
}