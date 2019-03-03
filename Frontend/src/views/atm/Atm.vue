<template>
  <div class="atm">
    <Navbar/>
    <div id="profile-container" class="container">
      <div class="row">
        <div class="col-8">

        </div>
        <div class="col-4">
          <ul class="list-group list-group-flush panel">
            <li class="list-group-heading">
              <h3>{{ numpadResult }}</h3>
            </li>
            <li class="list-group-item">
              <div class="row">
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadOne()">1</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadTwo()">2</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadThree()">3</button>
                </div>
              </div>
              <div class="row">
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadFour()">4</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadFive()">5</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadSix()">6</button>
                </div>
              </div>
              <div class="row">
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadSeven()">7</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadEight()">8</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadNine()">9</button>
                </div>
              </div>
              <div class="row">
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadClear()">Clear</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadZero()">0</button>
                </div>
                <div class="col-4">
                  <button type="button" class="btn btn-primary" v-on:click="numpadEnter()">⏎</button>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import Navbar from '@/components/Navbar.vue';

@Component({
  components: {
    Navbar,
  },
})
export default class Atm extends Vue {
  @Prop() public numpadResult = '';
  @Prop() public loggedIn = false;

  public numpadOne() {
    this.numpadResult = this.numpadResult.concat('1');
  }

  public numpadTwo() {
    this.numpadResult = this.numpadResult.concat('2');
  }

  public numpadThree() {
    this.numpadResult = this.numpadResult.concat('3');
  }

  public numpadFour() {
    this.numpadResult = this.numpadResult.concat('4');
  }

  public numpadFive() {
    this.numpadResult = this.numpadResult.concat('5');
  }

  public numpadSix() {
    this.numpadResult = this.numpadResult.concat('6');
  }

  public numpadSeven() {
    this.numpadResult = this.numpadResult.concat('7');
  }

  public numpadEight() {
    this.numpadResult = this.numpadResult.concat('8');
  }

  public numpadNine() {
    this.numpadResult = this.numpadResult.concat('9');
  }

  public numpadClear() {
    this.numpadResult = '';
  }

  public numpadZero() {
    this.numpadResult = this.numpadResult.concat('0');
  }

  public numpadEnter() {
    const result = this.numpadResult;
    this.numpadResult = '';
    this.loggedIn = true;
    // this.doSomething(result);
  }
}
</script>

<style lang="scss">
.list-group-heading {
  height: 50px !important;
}
</style>

