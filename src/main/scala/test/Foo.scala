package test

import android.os.Parcel
import android.os.Parcelable

class Foo(value: Int) extends Parcelable {
    override def describeContents() = 0
    override def writeToParcel(dst: Parcel, flags: Int) = dst.writeInt(value)
}

object Foo {
    val CREATOR: Parcelable.Creator[Foo] = new Parcelable.Creator[Foo] {
        override def createFromParcel(src: Parcel): Foo = new Foo(src.readInt())
        override def newArray(size: Int) = new Array[Foo](size)
    }
}
