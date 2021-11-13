package blackjack.presentation

import blackjack.domain.card.Card
import blackjack.domain.card.CardsDeck
import blackjack.domain.player.Player

class BlackjackGame {

    fun start(
        players: List<Player>,
        cardsDeck: CardsDeck,
    ): List<Player> {
        return players.map { player ->
            val cards = mutableListOf<Card>()

            repeat(2) {
                cards.add(cardsDeck.divide())
            }

            player.copy(cards = cards)
        }
    }

    fun addCard(
        player: Player,
        cardsDeck: CardsDeck
    ): Player {
        val card = cardsDeck.divide()
        return player.copy(
            cards = player.cards + card
        )
    }
}
