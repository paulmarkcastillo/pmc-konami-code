package io.kimo.konamicode;

/**
 * KonamiSequenceListener
 * <p>
 * Listeners of sequenced actions are implemented with this contract.
 */
public interface KonamiSequenceListener {

    boolean onSwipeSequenceAchieved();

    boolean validSwipeSequence();

    void resetSwipeSequence();

    boolean onPressedSequenceAchieved();

    boolean validPressedSequence();

    void resetPressedSequence();
}
