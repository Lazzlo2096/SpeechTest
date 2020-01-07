package de.sciss.speech

import javax.sound.sampled.{AudioFormat, AudioSystem, AudioFileFormat}

import com.sun.speech.freetts.VoiceManager
import com.sun.speech.freetts.audio.{JavaStreamingAudioPlayer, SingleFileAudioPlayer}

import de.sciss.file._ // userHome, require(), (/), .path()

object Test extends App {

  val vm = VoiceManager.getInstance()
  vm.getVoices.foreach(v => println(v.getName))

  val voice = vm.getVoice("kevin16")

  val player = new JavaStreamingAudioPlayer
/*
  //or record voice in file
  val dir = userHome / "Documents" / "misc"
  require(dir.isDirectory && dir.canWrite)
  val fullFileName = dir / "test-speech"
  val player = new SingleFileAudioPlayer(fullFileName.path, AudioFileFormat.Type.AIFF)
*/

  player.setAudioFormat(new AudioFormat(44100.0f, 16, 2, true, false)) // or 48000.0f

  voice.setRate(150f)
  voice.setPitchShift(0.65f)
  voice.setVolume(0.95f)
  voice.setAudioPlayer(player)
  voice.allocate()

  voice.speak("Hey Jonathan, I'm very impressed with your work.")

  player.close()
  voice.deallocate()
}
