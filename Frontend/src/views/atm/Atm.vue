<template>
  <div class="atm">
    <Navbar/>
    <div id="profile-container" class="container">
      <div class="row">
        <div class="col-8">

        </div>
        <div class="col-4">
          <ul class="list-group list-group-flush panel">
            <li class="list-group-heading keypad-heading">
              <h3>{{ numpadResult }}</h3>
            </li>
            <li class="list-group-item keypad-body">
              <div class="row under-padding">
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>1</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadOne()">1</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>2</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadTwo()">2</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>3</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadThree()">3</button>
                  </div>
                </div>
              </div>
              <div class="row under-padding">
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>4</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadFour()">4</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>5</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadFive()">5</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>6</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadSix()">6</button>
                  </div>
                </div>
              </div>
              <div class="row under-padding">
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>7</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadSeven()">7</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>8</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadEight()">8</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>9</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadNine()">9</button>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-4">
                  <div v-if="this.isMinLength()">
                    <button type="button" class="btn btn-secondary" disabled>Back</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadBack()">Back</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-secondary" disabled>0</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-primary" v-on:click="numpadZero()">0</button>
                  </div>
                </div>
                <div class="col-4">
                  <div v-if="this.isMaxLength()">
                    <button type="button" class="btn btn-primary" v-on:click="numpadEnter()">Enter</button>
                  </div>
                  <div v-else>
                    <button type="button" class="btn btn-secondary" disabled>Enter</button>
                  </div>
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
  @Prop() public maxLength = 4;

  public isMaxLength() {
    return (this.numpadResult.length >= this.maxLength);
  }

  public isMinLength() {
    return (this.numpadResult.length === 0);
  }

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

  public numpadBack() {
    this.numpadResult = this.numpadResult.substring(0, this.numpadResult.length - 1);
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
@import '@/scss/_palette.scss';
@import '@/scss/_settings.scss';

.keypad-heading {
  height: 50px !important;
  background: $palette-gray;
  color: $palette-soft-white;
}

.btn {
  height: 45px;
  width: 90px;
}

.under-padding {
  padding-bottom: 15px;
}
</style>
