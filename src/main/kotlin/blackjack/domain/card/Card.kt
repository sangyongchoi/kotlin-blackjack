package blackjack.domain.card

data class Card(
    val pattern: String,
    val denomination: String,
    val value: List<Int>,
)