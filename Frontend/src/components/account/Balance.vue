<template>
  <div id="account-balance">
    <ul class="list-group list-group-flush">
      <li class="list-group-heading">
        <h3>Account Balance</h3>
      </li>
      <li class="list-group-item">
        <h3>${{ amount }}</h3>
      </li>
    </ul>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';

@Component
export default class Balance extends Vue {
  @Prop() private amount!: string;
}
</script>

<style lang="scss">
.balance-box {
  padding: 10px;
  text-align: left;
}
</style>

